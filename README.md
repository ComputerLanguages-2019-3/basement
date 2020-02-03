# Basement 

Lenguaje de dominio específico el cual permite describir infraestructura como código utilizando una sintaxis de configuración de alto nivel. Basement se ayuda de la plataforma de Docker para montar los servicios necesarios con sus respectivas definiciones.

### Requerimientos

* Java JDK.
* Docker, con los permisos para ejecutarlo sin root. (https://docs.docker.com/install/linux/linux-postinstall/)
* Sistema operativo Linux.

### Compilación y ejecución

_Se recomienda guardar los archivos .bsmt en la carpeta input del código fuente, sin embargo se puede tener el archivo en cualquier dirección. (en la carpeta input/ se encuentran ejemplos del uso del lenguaje)_ 

* Para compilar y ejecutar los el código .bsmt se hace uso del siguiente comando.

  `java -jar out/artifacts/basement_infra_jar/basement_infra.jar file_path/file.bsmt`

### Uso

* Desplegar un nuevo servicio:

  `deploy nombre-contenedor imagen-docker-hub { }`

* Prender, apagar y eliminar un servicio existente respectivamente:

  `set up nombre-contenedor`

  `set up nombre-contenedor `

   `remove nombre-contenedor`

* Ejecutar un comando dentro de un servicio existente en un directorio determinado:

  ```bash
  perform nombre-contenedor {
  	directory: "/path",
  	command: "commando a ejecutar"
  
  }
  ```

  ​	

* Ver los servicios existentes, aplicando filtros.

  ```bash
  basement-list {
  	flag: "all",
  	image-type: "postgres"
  }
  ```

_Mirar los ejemplos dentro de la carpeta input para mayor entendimiento._

 
