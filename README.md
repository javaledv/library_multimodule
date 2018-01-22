                          Library is a Training Project.



                                    DEPLOYING
````

Infrastructure : Tomcat + Apache, OS Ubuntu 16.04 LTS.

				
			     CONFIGURING TOMCAT 
	
1. Download and Install Apache Tomcat	

	1.1 Download a binary distribution of Tomcat from:
	
	http://tomcat.apache.org/

	1.2	Unpack the binary distribution so that it resides in its own
    directory (conventionally named "apache-tomcat-[version]").

    $ sudo tar -xvf apache-tomcat-N.N.N.tar.gz -C /path/to/tomcat/

"N" must be replaced with the current version number

2. Start Up Tomcat.

	$ sudo /path/to/tomcat/bin/startup.sh 
   or
 	$ sudo /path/to/tomcat/bin/catalina.sh start

After startup, the default web applications included with Tomcat will be
available by visiting:

	http://localhost:8080/

Further information about configuring and running Tomcat can be found in
the documentation included here:
	
	https://tomcat.apache.org/tomcat-9.0-doc/RUNNING.txt

				
				 CONFIGURING APACHE 

1. Download the latest release from: 

	http://httpd.apache.org/download.cgi

2. Extract: 

	$ gzip -d httpd-NN.tar.gz
	$ tar xvf httpd-NN.tar
	$ cd httpd-NN

3. Configure: 
	
	$ sudo ./configure --prefix=PREFIX

4. Compile:
	
	$ sudo make

5. Install:

	$ sudo make install

6. Customize:	

	$ sudo nano PREFIX/conf/httpd.conf

7. Test	

	$ sudo PREFIX/bin/apachectl -k start

"NN" must be replaced with the current version number, and "PREFIX" must be replaced with the filesystem path under which the server should be installed. If PREFIX is not specified, it defaults to /usr/local/apache2.

Further information about configuring and running Apache can be found in
the documentation included here:

	https://httpd.apache.org/docs/2.4/install.html


		    APACHE AND TOMCAT INTEGRATION


1. Tomcat configuration.

 	1.1 Enable the AJP connector in the /path/to/tomcat/conf/server.xml file like this:

     <Connector port="8009" enableLookups="false" protocol="AJP/1.3" redirectPort="8443"/>    

    1.2 Restart the Tomcat:

    $ sudo /path/to/tomcat/bin/shutdown.sh
	$ sudo /path/to/tomcat/bin/startup.sh

		Apache2 configuration.


1. Install Apach2:
	
	$ sudo apt-get update
	$ sudo apt-get install apache2

2. Instal Apache 2 connector for the Tomcat Java servlet engine:

	$ sudo apt-get install libapache2-mod-jk

3. Enable mmod_jk module:

	$ sudo a2enmod jk

4. Add new virtual host:

	$ sudo nano /etc/apache2/sites-available/library.com.conf

	<VirtualHost *:80>

		ServerName library.ml
		ServerAlias www.library.ml

		DocumentRoot /var/www/library

		ErrorLog ${APACHE_LOG_DIR}/error.log
		CustomLog ${APACHE_LOG_DIR}/access.log combined

    	JkMount /* ajp13_worker
    	JkUnmount /static/* ajp13_worker

	</VirtualHost>

5. Configure the workers.properties file for libapache2-mod-jk: 
	
	$ sudo nano /etc/libapache2-mod-jk/workers.properties

   Change the following properties to appropriate paths:
	
	workers.tomcat_home (for eg. workers.tomcat_home=/usr/share/tomcat)

6. Disable default virtual host: 

	$ sudo a2dissite 000-default.conf

7. Enable your wirtual host: 

	$ sudo a2ensite library.com.conf

8. Restart Apache: 

	$ sudo service apache2 restart


			BUILDING PROJECT

1. Install gradle:

	$ sudo apt install gradle


2. Clone project from GitHub: 

	$ git clone https://github.com/javaledv/library_multimodule.git path/to/project/
		
3. Build war: 

	$ cd path/to/library_multimodule/library
	$ gradle build

			
			 DEPLOYING WAR TO TOMCAT
                                STATIC CONTENT TO APACHE

1. Addig Tomcat user for using tomcat-manger GUI: 
	
	$ sudo nano /path/to/tomcat/conf/tomcat-users.xml 

   add the following line: 

	<user username="admin" password="admin" roles="manager-gui"/>

   restart Tomcat:

    $ sudo /path/to/tomcat/bin/shutdown.sh
	$ sudo /path/to/tomcat/bin/startup.sh	

2. Open the browser and follow the link: 

	http://localhost:8080/manager/

	user: admin
	password: admin

3. In Application Section select undeploy buttom in row with root path "/".

4. In Deploy Section:
	
   Deploy directory or WAR file located on server:
	
	Context Path (required): /
	XML Configuration file URL:
	WAR or Directory URL: path/to/library_multimodule/library/build/lib/library-multimodule-application.war

	Deploy

5. Add static content to the Apache DocumentRoot /var/www/library

	$ cd /var/www/
	$ sudo mkdir library
	$ sudo sudo cp -a /path/to/library_multimodule/library/src/main/webapp/static /var/www/library/

6. Restart Apache and: 

	$ sudo service apache2 restart

7. Restart the Tomcat:

    $ sudo /path/to/tomcat/bin/shutdown.sh
	$ sudo /path/to/tomcat/bin/startup.sh

8. Open Browser and follow the link:

	localhost/

You will see Library's Welcome Page.

