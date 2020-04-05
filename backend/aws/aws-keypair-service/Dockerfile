FROM tiangolo/meinheld-gunicorn-flask:python3.7-alpine3.8

WORKDIR /app
# We copy just the requirements.txt first to leverage Docker cache
COPY ./requirements.txt ./requirements.txt

RUN pip install -r requirements.txt

COPY main.py /app/
