# GranAutoUTN
Proyecto personal para ejercicio de la UTN

## Práctica de clase 
### Gran viaje 
En esta oportunidad nos han solicitado el diseño y desarrollo de un auto para un famoso juego de consolas. Par esta primera iteración, necesitaremos: 
• Pedirle a un auto que se encienda y que se apague 
• Pedirle a un auto que acelere a X km/h 
• Pedirle a un auto que se detenga 
• Preguntarle a un auto si está en la reserva de combustible o próximo a estarlo 
• Conocer la temperatura del motor de un auto; cuyo factor estará determinado por un número decimal. 

#### Además, se sabe que: 
• Si el auto no está encendido, no se lo podrá acelerar ni preguntarle si está en la reserva de combustible (o próximo a estarlo) 
• Cuando un auto se enciende, aumenta 70° la temperatura de su motor y consume el 0.001% del combustible. 
• Cuando un auto se detiene, aumenta la temperatura en 0.04° multiplicado por la velocidad que tenía el auto al momento que se le dio la orden de frenado. 
• Cuando un auto acelera, aumenta su temperatura en 0.2° multiplicado por la velocidad a la que debe acelerar. 
• Cuando el auto está caliente, se deberá activar el electro ventilador, cuyo componente enfría el motor en 15°. Se considera que un auto está caliente cuando su temperatura es mayor o igual a 95°. 
• Un auto consume 133 ml por kilómetro recorrido. 
• Un auto comienza a utilizar la reserva cuando queda menos del 10% de la capacidad total del combustible. 
• Un auto está próximo a la reserva cuando queda menos del 15% de la capacidad total del combustible. 

Supuestos y consideraciones: 
➢ Cada vez que un auto se apaga, la temperatura pasará a 0°. 
➢ Un auto puede tener capacidad de combustible diferente a otro. Esta capacidad es medida en Litros. 
➢ Siempre se acelera una cantidad entera de km/h. 

