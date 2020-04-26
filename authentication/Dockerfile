FROM node:alpine

WORKDIR /app

COPY package.json package*.json /app/

RUN npm install --only=production

COPY server.js /app/

COPY modules/ /app/modules/

CMD [ "npm", "start" ]
