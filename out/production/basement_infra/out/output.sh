#!/bin/bash 
docker start timescaledb
docker exec -i timescaledb bash -c "psql -U uptimetest -d uptimetimescale_db -c  'select * from electric;' "
docker run --name postgrescontainer postgres -d