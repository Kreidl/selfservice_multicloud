FROM tiangolo/meinheld-gunicorn-flask:python3.7-alpine3.8

WORKDIR /app
# We copy just the requirements.txt first to leverage Docker cache
COPY ./requirements.txt ./requirements.txt

RUN pip install -r requirements.txt

COPY *.py /app/

COPY config.txt /app/

COPY api.yml /app/

COPY /aws /app/aws

COPY /azure /app/azure

COPY /authentication /app/authentication

COPY /util /app/util
