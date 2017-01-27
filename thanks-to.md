#from 
*	xml [http://www.journaldev.com/9189/resteasy-tutorial-eclipse-tomcat]
* json [https://www.mkyong.com/webservices/jax-rs/integrate-jackson-with-resteasy]

#resteasy 
	
#creation et initialisation d'une app java sans spring ... 

#erreur 
java.lang.UnsupportedClassVersionError: org/jboss/resteasy/plugins/server/servlet/ResteasyBootstrap : Unsupported major.minor version 52.0 (unable to load class org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap)
>incompatibilité de version java entre tomcat 7 et java7 : projet configuré avec 1.7 et tomcat7 fonctionne avec 1.6 max -> installation de tomcat 8

    J2SE 8 = 52
    J2SE 7 = 51
    J2SE 6.0 = 50
    J2SE 5.0 = 49
    JDK 1.4 = 48
    JDK 1.3 = 47
    JDK 1.2 = 46
    JDK 1.1 = 45

toujours bug ! car 52 -> descente des versions de 3.1.0.Final -> 3.0.13.Final

#provider json avec jackson cf pom