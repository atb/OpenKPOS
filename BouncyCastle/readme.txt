-- README --

-- How to Install the BouncyCastle provider --

-- No Linux --

Usualmente o Ubuntu tera instalado o OpenJDK. Este esta, por defeito,
 no folder /usr/lib/jvm/java-6-openjdk/

La estara o subdirectorio jre/lib/ext onde se deve colocar a extensao do BC (o jar) e
 o directorio jre/lib/security onde se devera configurar o provider do BC no ficheiro
 java.security. Deve-se adicionar uma linha semelhante a seguinte:
 security.provider.N=org.bouncycastle.jce.provider.BouncyCastleProvider
 (onde N deve ser o numero a seguir na "lista" - ver ficheiro java.security)

-- No Windows --

Normalmente o java no Windows esta em c:\program files\java\jre7 (se for a versao 7)

La estara o subdirectorio \lib\ext onde se deve colocar a extensao do BC (o jar) e
 o directorio \lib\security onde se devera configurar o provider do BC no ficheiro
 java.security. Deve-se adicionar uma linha semelhante a seguinte:
 security.provider.N=org.bouncycastle.jce.provider.BouncyCastleProvider
 (onde N deve ser o numero a seguir na "lista" - ver ficheiro java.security)

 
 

