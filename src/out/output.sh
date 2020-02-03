#!/bin/bash 
docker stop test-postgres
docker rm test-postgres
docker run --name test-postgres -p 80:800 -e POSTGRES_USER="user" -e POSTGRES_PASSWORD="pass" -e POSTGRES_DB="db" -d postgres
docker ps  | grep postgres
