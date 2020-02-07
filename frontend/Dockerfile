FROM node:alpine AS builder

WORKDIR /app

COPY package.json /app/package.json

RUN npm install

COPY . /app/

RUN npm run build -- --prod

FROM nginx:alpine


COPY --from=builder /app/dist/* /usr/share/nginx/html/
