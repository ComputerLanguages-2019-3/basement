#!/bin/bash 
docker stop test-postgres
docker rm test-postgres
docker run --name test-postgres -p 80:800 -d postgres