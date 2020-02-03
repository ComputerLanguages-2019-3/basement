#!/bin/bash 
docker run --name timescale-not-detached -p 4010:5432 timescale/timescaledb:latest-pg11
