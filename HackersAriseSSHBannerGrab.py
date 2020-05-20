#! /usr/bin/python3

import socket

ip = input('Input IP: ')
Ports = [21,22,25,3306]

for i in range (0,4):

    s = socket.socket()

    Port = Ports[i]

    print ('This Is the Banner for the Port')

    print (Port)
    try:
        s.connect ((ip, Port))

        answer = s.recv (1024)

        print (answer)

        s.close ()
    except:
        print ('no answer')
