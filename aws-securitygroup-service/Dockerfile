FROM python:alpine3.11

WORKDIR /app
# We copy just the requirements.txt first to leverage Docker cache
COPY ./requirements.txt ./requirements.txt

RUN pip install -r requirements.txt

COPY main.py /app/

COPY /Models /app/Models

ENTRYPOINT python main.py
