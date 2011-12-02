## JAX-RS with Jersey/Grizzly on Heroku

JAX-RS is a great way to build RESTful services in Java. This is a very quick and simple example of how you can deploy a JAX-RS application on Heroku. It's based on the helloworld sample in the [Jersey 1.0.3 samples collection](http://download.java.net/maven/2/com/sun/jersey/samples/jersey-samples/1.0.3/jersey-samples-1.0.3-project.zip). A few tweaks was made which you can see in the commit log.

Assuming you're already set up with Heroku including the foreman tool, all you need to do to run this locally is

1. Clone this repo
2. cd into the directory
3. mvn package
4. foreman start

To deploy to Heroku:

1. heroku create --stack cedar
2. git push heroku master
3. curl http://[appname].herokuapp.com/hello

It's that simple.

