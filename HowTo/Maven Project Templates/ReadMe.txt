Maven Project Templates (Archetypes)

Process Application (EJB, WAR)
https://docs.camunda.org/manual/7.4/user-guide/process-applications/maven-archetypes/

Cand faceti un proiect nou, in parametrii din template la "jboss-version" sa puneti "8.2.1.Final"

Cu template-urile de aici am facut proiectele:
camunda-template-cockpit-plugin (plugin cockpit - instances count)
camunda-template-example (process app)

Ca sa publici un plug-in in aplicatia deployata deja in WildFly trebuie deschis 
Server\server\wildfly-8.2.1.Final\standalone\deployments\camunda-webapp-jboss-7.4.0.war
si adaugat "de mana" jar-ul rezultat camunda-template-cockpit-plugin.jar (Run as Maven install din eclipse)
in camunda-webapp-jboss-7.4.0.war\WEB-INF\lib 