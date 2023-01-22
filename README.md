## conclusion 
> template param are same as pathparam 
> done xml config


## dependencies

```java
<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.inject</groupId>
			<artifactId>jersey-hk2</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.containers</groupId>
			<artifactId>jersey-container-servlet</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-server</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-common</artifactId>
			<version>3.0.8</version>
		</dependency>
	</dependencies>
```

## web.xml

```xml
<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>


	<servlet>

		<servlet-name>jersey</servlet-name>
		<servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>

		<init-param>
			<param-name>jersey.config.server.provider.packages</param-name>
			<param-value>com.lavesh.templateparam</param-value>
		</init-param>

		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>jersey</servlet-name>
		<url-pattern>/api/*</url-pattern>
	</servlet-mapping>

</web-app>

```


## app class

```java
package com.lavesh.templateparam;

import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/temp")
public class AppClass {

	@GET
	@Path("{id}/{name}/type")
	@Produces("text/plain")
//	@Produces(MediaType.TEXT_PLAIN)
	public String get(@PathParam("id") String id, @PathParam("name") String name) {

		return " " + UUID.randomUUID().toString() + " " + " id  : " + id + " name : " + name;
	}
}

```

```url
http://localhost:8080/4_template_parameg/api/temp/5dsd/lavesh/type
```