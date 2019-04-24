# Trabajo Práctico: Eventeando
[![Build Status](https://travis-ci.com/LeandroAntunez/dapp-grupoM-2019S1.svg?branch=master)](https://travis-ci.com/LeandroAntunez/dapp-grupoM-2019S1)
[![Code Coverage](https://codecov.io/gh/LeandroAntunez/dapp-grupoM-2019S1/coverage.svg)](https://codecov.io/gh/LeandroAntunez/dapp-grupoM-2019S1)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/0fd7603303fb4a31bbf043864de44d70)](https://www.codacy.com/app/LeandroAntunez/dapp-grupoM-2019S1?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=LeandroAntunez/dapp-grupoM-2019S1&amp;utm_campaign=Badge_Grade)

**Materia**: [Desarrollo de Aplicaciones](https://sites.google.com/site/unqdesarrollodeaplicaciones).

**Cuatrimestre**: 2019-S1.

**Integrante Grupo M**: [Leandro Antunez](https://github.com/LeandroAntunez)

**Universidad Nacional de Quilmes**.

## Aclaraciones Generales
### Objetivo
Implementar una solución web punta a punta resolviendo
desafíos de arquitecturas WEB en un marco SPA, modelado
de objetos y separación clara de responsabilidades según las
definiciones de arquitectura planteadas.

### Se espera
*   **Versionado**: Se deberá usar un repositorio generado en *Github*.
*   **Integracion Continua**: Build de [Travis](https://travis-ci.org/) en verde.
*   **Deploy Continuo**: [Heroku](https://www.heroku.com/) en su ultima version.
*   **Responsive**: La aplicación debe ser completamente responsive ya que estará accesible desde múltiples dispositivos.
*   **Ingles**: La implementacion de clases, metodos, etc. tiene que ser en ingles.

## Enunciado
### Introducción
Hoy en día es común encontrar sitios o aplicaciones que nos ayudan a organizar un encuentro con
amigos, una fiesta o cualquier otro tipo de evento donde sea necesario conocer la cantidad de
asistentes, las cantidades a comprar, el monto a pagar por cada asistente, etc.

Eventeando busca crear una nueva aplicación donde no solo se puedan crear eventos, invitar
asistentes, calcular las comprar, dividir gastos y más, sino también contar con una cuenta corriente
que permita a los usuarios ingresar dinero a través de distintos medios, solicitar micro préstamos o
prestar dinero a sus amigos, por ejemplo.

### Eventos (Event)
#### Tipos de Eventos
Con eventeando se podrán organizar tres tipos de eventos, los cuales se describen a continuación:

*   **Fiesta (Party):** En este caso se envían invitaciones a través de la aplicación y por cada confirmación
de asistencia, la aplicación va calculando la cantidad de mercaderías a comprar.
En este tipo de eventos no se distribuyen los gastos del mismo sino que corren por cuenta del organizador. Al momento de crear el evento, el organizador no sólo ingresa una lista de usuarios a los cuales invitar, sino también hasta cuanto tiempo antes se admiten confirmaciones.
*   **Baquita (WhipRound):** En este caso se determina el evento a realizar y sus gastos (comida, alquiler de
salon, etc) y a partir de la cantidad de asistentes la aplicación determina cuánto debe pagar
cada uno de ellos.
La baquita puede tener dos modalidades. En la **primera (FirstBuyThenDivide)**, una o más personas realizan las compras,
informan lo gastado y luego se divide con los demás asistentes al evento.
En la **segunda (FirstCalculateThenCollect)**, la aplicación calcula un costo estimado total para el evento (se puede valer de
información propia o ingresada por los usuarios), crea una cuenta común a la cual deberán girar su parte los asistentes y una vez reunido el dinero, el organizador puede disponer de los mismos para las compras.
*   **Canasta (Basket):** Este es un tipo de evento similar a la baquita, pero la diferencia radica en que en
lugar de dividir los gastos en cuotas iguales a pagar por los asistentes, se presenta la lista de
gastos a realizar y, al mejor estilo scrum meeting, cada asistente elige un ítem del cual
hacerse cargo.

#### Invitaciones
Las invitaciones a eventos se realizarán enviando correos electrónicos a los participantes, los cuales
deberán registrarse en la aplicación para poder tomar parte del evento en cuestión.

### Templates
Adicionalmente, para cada tipo de evento la aplicación debe permitir configurar *templates*, los cuales
pueden ser elegidos por los usuarios al momento de crear un evento, de modo de facilitar su
organización. *Por ejemplo, un template para asado con amigos en modalidad canasta, podría
contener elementos tales como bolsa de carbon, asado, vacio, vino, tomate, lechuga y pan*.

Al momento que un usuario selecciona un template, debe poder visualizar una descripción general
del mismo y tener la posibilidad de visualizar el detalle de los elementos que este contiene. La
aplicación no solo debe mostrar la descripción general del template sino también listar aquellos otros
templates que hayan sido utilizados por otros usuarios que eligieron el template seleccionado *(el
clasico, quien compró esto también compró esto otro)*.

### Usuarios
Los usuarios que deseen utilizar eventeando deberán registrarse en la aplicación, para lo cual será
necesaria la siguiente información:
1. Nombre: Texto - Max 30 - Requerido.
2. Apellido: Texto - Max 30 - Requerido.
3. Email: Formato_email - Requerido
4. Contraseña: Min 4 - Max 10 - Alfanumérico - Requerido.
5. Fecha de Nacimiento : DD/MM/AAAA - Requerido
#### Autenticación
También será necesario ofrecer un sistema de autenticación mediante *auth0* con cuentas de *Gmail*.

### Transacciones
La aplicación debe llevar el control de los movimientos realizados por el usuario con el objetivo de poder
listar su estado de cuenta cuando sea requerido. Por cada movimiento se debe conocer
mínimamente el tipo, la fecha y el monto.
#### Ingresos
Para ingresar dinero en la aplicación, la operación puede realizarse en efectivo en un punto de carga
similar a los utilizados para pagos de servicios o puede hacerse utilizando una tarjeta de crédito. 
#### Retiros
Para poder retirar dinero de la aplicación, se podrá solicitar el efectivo en los mismos centros de
carga o solicitar la acreditación en la tarjeta de crédito, esto último se realiza a través de la
aplicación.

### Micro creditos
Por último, la aplicación contempla la posibilidad de otorgar micro créditos a aquellos usuarios que
hayan demostrado ser cumplidores.
#### Cumplidores
Ser **cumplidor** implica que en al menos 3 de los últimos eventos
en que participó (baquita y/o canasta), cumplió en término con su participación. Si el usuario es
cumplidor y no posee un préstamo en curso, podrá solicitar $1000 a retornar en 6 cuotas mensuales
de $200 cada una.
#### Cuotas
Las cuotas se debitan automáticamente de la cuenta del usuario el día 5 de cada
mes.
#### Morosos
Si el usuario no posee el dinero suficiente, la cuota queda pendiente hasta que existan fondos y
el usuario pasa a ser **moroso**.

### Administracion
#### Listado de creditos
Desde la administración de eventeando, se desea poder acceder al listado de créditos en curso y su
situación. (usuario solicitante, cuotas restantes, morosidad)
#### Home
La home de la aplicación deberá mostrar mis eventos en curso, mis últimos eventos y los eventos
mas populares.
#### Movimientos de usuario
La aplicación debe llevar el control de los movimientos realizados
por el usuario con el objetivo de poder
listar su estado de cuenta cuando sea requerido.

Por cada movimiento se debe conocer mínimamente el tipo, la fecha y el monto.
