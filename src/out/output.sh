#!/bin/bash 
docker stop postgres-container
docker rm postgres-container
docker run --name postgres-container -p 4001:5234 -e POSTGRES_USER="user" -e POSTGRES_PASSWORD="pass" -e POSTGRES_DB="db" -d postgres
