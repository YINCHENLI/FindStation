create database blog;

use blog;

DROP TABLE IF EXISTS element;
DROP TABLE IF EXISTS station;

CREATE TABLE element ( id int NOT NULL AUTO_INCREMENT PRIMARY KEY, stationid VARCHAR(12) NOT NULL, datestring VARCHAR(10), attribute VARCHAR(5), value VARCHAR(10));

LOAD DATA LOCAL INFILE '2017.csv' INTO TABLE element FIELDS TERMINATED BY ','  ENCLOSED BY '"'  LINES TERMINATED BY '\n' (stationid, datestring, attribute, value);

CREATE TABLE station (id VARCHAR(11) NOT NULL, latitude VARCHAR(8), longitude VARCHAR(9), elevation VARCHAR(6), state VARCHAR(2), name VARCHAR(30), gsn VARCHAR(3), others VARCHAR(14));

LOAD DATA LOCAL INFILE 'ghcnd-stations.txt' INTO TABLE station (@row) SET id = SUBSTR(@row,1,11), latitude = SUBSTR(@row,13,20), longitude = SUBSTR(@row,22,30), elevation = SUBSTR(@row,32,37), state = SUBSTR(@row,39,40), name = SUBSTR(@row,42,71), gsn = SUBSTR(@row,73,75), others = SUBSTR(@row,73-86);