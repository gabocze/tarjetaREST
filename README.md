# TarjetaREST
API REST que permite consultar la tasa de una operación con tarjeta

## Instalación con VS Code
### Requisitos
Si bien el proyecto utiliza las características de Java 8, tiene algunas dependencias que requieren una versión más alta. Se recomienda Java 11 ó 17.

### Pasos
1. Primero agregar el proyecto [Java-card-operation](https://github.com/gabocze/Java-card-operation/), consultando su propio `README.md` si fuera necesario.
1. Ir a `Archivo ▸ agregar carpeta al área de trabajo`.
1. Aceptar la instalación de los plugins sugeridos de Java y de Maven y esperar a que se instalen.
1. Si no está visible, ir a `Ver ▸ Abrir vista`
    1. Escribir `Maven` ENTER
1. Ir a la ventana Maven
    ```
    MAVEN
      Java-card-operation
      tarjetaREST
    ```
2. Desplegar el proyecto `tarjetaREST`
    ```
    MAVEN
      Java-card-operation
      tarjetaREST
        tarjetarest
    ```
1. Hacer clic derecho sobre `tarjetarest` y seleccionar `Run Maven Command ▸ install`

## Ejecución
1. Si no está visible, ir a `Ver ▸ Abrir vista`
    1. Escribir `Java Project` ENTER
1. Ir a la ventana Java Project
    ```
    JAVA PROJECTS
      Java-card-operation
      tarjetaREST
    ```
2. Desplegar el proyecto `tarjetaREST`
    ```
    JAVA PROJECTS
      Java-card-operation
      tarjetaREST
        tarjetarest
    ```
3. Hacer clic en el botón `[▶🪲]`, que está situado a la derecha de `tarjetarest`

## Modo de uso
Al ejecutar la aplicación según el apartado anterior, va a disponibilizarse en `http://localhost:8080`.

El endpoint `consumo` permite calcular la tasa de comisión de un consumo.

Utilizando el navegador web, invocar la URL `http://localhost:8080/consumo`, enviando los siguientes parámetros

| parámetro | significado | formato |
|---|---|---|
| marca | La marca de la tarjeta.| `VISA`, `NARA`, `AMEX`|
|monto|El monto del consumo.|Número con o sin punto decimal. Ej. `123`, `524.56`|
|fecha| la fecha del consumo|`AÑO-MES-DÍA`. Ej. `2023-10-05`|

Ej. `http://localhost:8080/consumo?marca=VISA&monto=524.56&fecha=2023-10-05`

## Azure Cloud
También hay disponible una instancia en la nube de Azure, la cual se utiliza mediante, por ejemplo:

`https://tarjetawebrest.azurewebsites.net/consumo?marca=NARA&monto=789.40&fecha=2023-07-01`
