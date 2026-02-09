



1. GenerationType.IDENTITY
   ◦ Cómo funciona: Delega la generación del ID a la base de datos utilizando una columna autoincremental (como AUTO_INCREMENT en MySQL o SERIAL en PostgreSQL).
   ◦ Cuándo usarla: Es la más común para bases de datos como MySQL, SQL Server o DB2.
   ◦ Nota: Hibernate debe realizar el INSERT inmediatamente para obtener el ID, lo que deshabilita ciertas optimizaciones de procesamiento por lotes (batching).
2. GenerationType.SEQUENCE
   ◦ Cómo funciona: Utiliza una secuencia de base de datos (un objeto especial de la BD que genera números) para obtener el siguiente valor.
   ◦ Cuándo usarla: Es la opción preferida y más eficiente para bases de datos que soportan secuencias, como Oracle y PostgreSQL.
   ◦ Ventaja: Permite a Hibernate obtener bloques de IDs por adelantado sin insertar filas, lo que mejora el rendimiento.
3. GenerationType.TABLE
   ◦ Cómo funciona: Simula una secuencia utilizando una tabla normal de base de datos para llevar la cuenta del último valor generado.
   ◦ Cuándo usarla: Rara vez se recomienda hoy en día debido a su bajo rendimiento (requiere bloqueos de fila y múltiples consultas). Solo úsala si tu base de datos no soporta IDENTITY ni SEQUENCE.
4. GenerationType.AUTO (Por defecto)
   ◦ Cómo funciona: Deja que el proveedor de persistencia elija la estrategia más apropiada basándose en el dialecto de la base de datos configurada.
   ◦ Cuándo usarla: Útil para prototipos o si necesitas que la aplicación sea portable entre diferentes tipos de bases de datos sin cambiar el código. A menudo termina eligiendo SEQUENCE o TABLE dependiendo de la versión de Hibernate.
   Resumen: Para tu proyecto, si estás usando MySQL, IDENTITY es la opción correcta. Si usaras PostgreSQL u Oracle, SEQUENCE sería mejor.