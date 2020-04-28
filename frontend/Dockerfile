FROM node:alpine AS builder

WORKDIR /app

COPY package.json /app/package.json

RUN npm install && npm audit fix

COPY . /app/


RUN npm run build -- --prod

FROM nginx:alpine


COPY --from=builder /app/dist/* /usr/share/nginx/html/
CMD ["/bin/sh",  "-c",  "envsubst < /usr/share/nginx/html/assets/env.template.js > /usr/share/nginx/html/assets/env.js && exec nginx -g 'daemon off;'"]
