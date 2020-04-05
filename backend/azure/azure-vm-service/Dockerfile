FROM tiangolo/meinheld-gunicorn-flask:python3.7-alpine3.8

RUN apk add gcc musl-dev python3-dev libffi-dev openssl-dev

WORKDIR /app
# We copy just the requirements.txt first to leverage Docker cache
COPY ./requirements.txt ./requirements.txt

RUN pip install -r requirements.txt

COPY main.py /app/
