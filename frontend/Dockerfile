FROM node:alpine AS builder

WORKDIR /app

COPY . /app

RUN rm -rf dir /app/node_modules

RUN npm install && \
    npm run build

FROM nginx:alpine

COPY --from=builder /app/dist/* /usr/share/nginx/html/
