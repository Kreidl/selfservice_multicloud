FROM node:alpine

WORKDIR /app

COPY package.json package*.json /app/

RUN npm install --only=production

COPY server.js /app/


CMD [ "npm", "start" ]
