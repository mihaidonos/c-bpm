In ordinea asta:
mysql-installer-web-community-5.7.10.0.msi
mysql-utilities-1.5.6-winx64.msi

La sfarsit ar trebui sa fie versiunile din poza MySqlVersion.PNG

Start Server (StartServer.PNG)

Configurati o conexiune la serverul de baza de date cu setarile default (ServerStatus.PNG,DbConn.PNG)

Adaugati userul root cu parola root (RootUser.png) si dati-i drepturi de bo$$ pe peste tot

Creati o baza de date numita "engine" si rulati scripturile din E:\WORK\GitHub\c-bpm\Server\sql\A_create: mysql_engine_7.4.0 & mysql_identity_7.4.0
(Schema.png)
Creati o baza de date numita "pizza" si creati tabelul : @Table(name = "order", schema = "pizza")
(E tabelul din proiectul pizza-order/OrderEntity)





