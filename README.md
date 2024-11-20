# Sistema Gestor de Buses

Un sistema para la gestión de buses, desarrollado con un frontend en **React** y un backend en **Spring Boot**. La base de datos utiliza **MySQL** para el almacenamiento.

---

## 📦 Tecnologías Utilizadas
### Frontend:
- **Node.js**: v18.18.2
- **npm**: v10.9.0
- **React**: v18.3.1
- **TypeScript**: 4.9.5

### Backend:
- **Spring Boot**
- **Java 17** :17
- **MySQL**: v8

---

## 🚀 Configuración del Proyecto
### **1. Configuración del Frontend**
1. Navega a la carpeta `interfaz-bus` o la ubicación del proyecto React dentro de `gestor-de-buses`.
2. Instala las dependencias:
  
   npm install

3. Inicia el servidor de desarrollo:
npm start
Asegúrate de que el backend esté corriendo para consumir el endpoint /bus.
4. Configuración del Backend
Navega a la carpeta `API-de-buses` dentro de `gestor-de-buses`.

Configura los datos de acceso a la base de datos en el archivo application.properties:

Properties
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
spring.datasource.username: Reemplázalo con el nombre de usuario de tu base de datos MySQL.
spring.datasource.password: Reemplázalo con la contraseña de tu base de datos MySQL.
Compila y ejecuta el backend:


mvn spring-boot:run
El backend estará disponible por defecto en: http://localhost:8005.

### 🗂️ Estructura del Proyecto

gestor-de-buses/
├── Interfaz-bus/             # Código del frontend (React)
│   ├── src/              # Código fuente del frontend
│   ├── public/           # Recursos públicos
│   └── package.json      # Dependencias del proyecto
├── API-de-buses/              # Código del backend (Spring Boot)
│   ├── src/main/java/    # Código fuente del backend
│   ├── src/main/resources/
│   │   └── application.properties # Archivo de configuración
│   └── pom.xml           # Dependencias del proyecto
└── README.md             # Documentación del proyecto
### 🗒️ Notas Adicionales
Asegúrate de que tanto el frontend como el backend usen puertos diferentes para evitar conflictos. Por defecto:
Frontend: http://localhost:3000
Backend: http://localhost:8005
Si necesitas exportar la base de datos, sigue las instrucciones mencionadas en la documentación.
### 💡 Funcionalidades
# Implementadas:
Mostrar lista de buses en una tabla (consumiendo el endpoint /bus).
Alert con detalles de cada bus al hacer clic en "Ver detalles".
Configuración de conexión entre el frontend y backend.
# Por implementar (opcional):
Paginación en la tabla de buses.






