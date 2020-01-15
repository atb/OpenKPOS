#!/bin/sh

# java -cp ./hsqldb.jar org.hsqldb.util.DatabaseManagerSwing --help

# url jdbc:hsqldb:file:./openkpos_data_demo;ifexists=true;crypt_lobs=true;crypt_key=537c3950a35a7b733a22f48f01a0e79a;crypt_type=blowfish 
# url jdbc:hsqldb:file:./openkpos_data_release;ifexists=true;crypt_lobs=true;crypt_key=537c3950a35a7b733a22f48f01a0e79a;crypt_type=blowfish 
java -cp ./hsqldb.jar org.hsqldb.util.DatabaseManagerSwing
