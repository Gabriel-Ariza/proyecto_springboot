DROP DATABASE IF EXISTS ong;
CREATE DATABASE ong;
USE ong;


/*  ----* LLENANDO LA TABLA SEDE *----  */
INSERT INTO sede (ciudad, direccion, director) VALUES
('Bogotá', 'Calle 123 # 45-67', 'Juan Pérez'),
('Medellín', 'Carrera 15 # 89-12', 'María Rodríguez'),
('Cali', 'Av. Sexta # 12-34', 'Carlos García'),
('Barranquilla', 'Calle 67 # 23-45', 'Ana Martínez'),
('Bucaramanga', 'Carrera 45 # 67-89', 'Luis Ramírez'),
('Cartagena', 'Calle 12 # 34-56', 'Carolina Díaz'),
('Cúcuta', 'Av. Boyacá # 56-78', 'Andrés Gutiérrez'),
('Ibagué', 'Carrera 23 # 89-01', 'Laura Moreno'),
('Villavicencio', 'Calle 45 # 12-34', 'Jorge González'),
('Santa Marta', 'Av. Séptima # 67-89', 'Sofía Torres');


/*  ----? LLENANDO LA TABLA PERSONA ?----  */
INSERT INTO persona (correo_electronico, direccion_vivienda, fecha_nacimiento, nombre_completo, numero_telefono, sede_id) VALUES
('juan.perez@email.com', 'Calle 123 # 45-67, Bogotá', '1985-07-25', 'Juan Pérez Gómez', 3112345678, 1),
('maria.rodriguez@email.com', 'Carrera 15 # 89-12, Medellín', '1990-03-18', 'María Rodríguez Martínez', 3203456789, 2),
('carlos.garcia@email.com', 'Av. Sexta # 12-34, Cali', '1978-11-05', 'Carlos García Ospina', 3154567890, 3),
('ana.martinez@email.com', 'Calle 67 # 23-45, Barranquilla', '1992-09-22', 'Ana Martínez Ruiz', 3205678901, 4),
('luis.ramirez@email.com', 'Carrera 45 # 67-89, Bucaramanga', '1983-04-30', 'Luis Ramírez Herrera', 3167890123, 5),
('carolina.diaz@email.com', 'Calle 12 # 34-56, Cartagena', '1987-12-10', 'Carolina Díaz Parra', 3201234567, 1),
('andres.gutierrez@email.com', 'Av. Boyacá # 56-78, Cúcuta', '1995-06-15', 'Andrés Gutiérrez Vargas', 3208901234, 2),
('laura.moreno@email.com', 'Carrera 23 # 89-01, Ibagué', '1989-02-03', 'Laura Moreno Castillo', 3165678901, 3),
('jorge.gonzalez@email.com', 'Calle 45 # 12-34, Villavicencio', '1981-10-20', 'Jorge González Rojas', 3207890123, 4),
('sofia.torres@email.com', 'Av. Séptima # 67-89, Santa Marta', '1993-08-12', 'Sofía Torres Cárdenas', 3209012345, 5);



/*  ----* LLENANDO LA TABLA SOCIO *----  */
INSERT INTO socio (cuenta_bancaria, persona_id) VALUES
('1234567890', 1),
('9876543210', 2),
('5554443332', 3),
('1112223334', 4),
('4445556667', 5),
('7778889990', 6),
('2223334445', 7),
('6667778889', 8),
('9990001112', 9),
('3334445556', 10);

/*  ----? LLENANDO LA TABLA CUOTA ?----  */
INSERT INTO cuota (fecha_pago, tipo_cuota, valor, socio_id) VALUES
('2023-01-01', 0, 10, 1),
('2023-01-03', 1, 20, 2),
('2023-02-02', 2, 30, 3),
('2023-01-05', 0, 10, 4),
('2023-02-04', 1, 20, 5),
('2023-01-03', 2, 30, 6),
('2023-03-01', 0, 10, 7),
('2023-11-02', 1, 20, 8),
('2023-12-26', 2, 30, 9),
('2022-12-28', 0, 30, 10),
('2024-01-07', 1, 30, 1),
('2024-01-03', 2, 10, 2);


/*  ----? LLENANDO LA TABLA MATERIAL  ?----  */
INSERT INTO material (nombre, tipo) VALUES
('Medicamentos', 0),
('Alimentos no perecederos', 1),
('Agua embotellada', 1),
('Mantas', 1),
('Ropa', 1),
('Artículos de higiene', 1),
('Juguetes', 1),
('Libros', 1),
('Equipos médicos', 0),
('Carpas', 1);



/*  ----* LLENANDO LA TABLA VOLUNTARIO *----  */
INSERT INTO voluntario (disponibilidad, numero_trabajos, profesion, tipo, persona_id) VALUES
(1, 3, 'Ingeniero Civil', 1, 1),
(0, 2, 'Profesora de Matemáticas', 1, 2),
(1, 5, 'Médico General', 1, 3),
(0, 1, 'Abogada Laboral', 0, 4),
(1, 4, 'Arquitecto', 1, 5),
(0, 2, 'Enfermera Jefe', 1, 6),
(1, 6, 'Diseñador Gráfico', 1, 7),
(0, 3, 'Contadora Pública', 0, 8),
(1, 7, 'Programador Web', 1, 9),
(0, 1, 'Chef Ejecutivo', 1, 10);


/*  ----? LLENANDO LA TABLA REFUGIO ?----  */
INSERT INTO refugio (ciudad, direccion, nombre) VALUES
('Bogotá', 'Calle 123 # 45-67', 'Refugio Esperanza'),
('Medellín', 'Carrera 15 # 89-12', 'Refugio Paz'),
('Cali', 'Avenida 6ta # 12-34', 'Refugio Hogar'),
('Barranquilla', 'Calle 67 # 23-45', 'Refugio Amor'),
('Bucaramanga', 'Carrera 45 # 67-89', 'Refugio Calido'),
('Cartagena', 'Calle 12 # 34-56', 'Refugio Sonrisa'),
('Cúcuta', 'Avenida Boyacá # 56-78', 'Refugio Acogedor'),
('Ibagué', 'Carrera 23 # 89-01', 'Refugio Amigo'),
('Villavicencio', 'Calle 45 # 12-34', 'Refugio Feliz'),
('Santa Marta', 'Avenida 7ma # 67-89', 'Refugio Luz');


/*  ----* LLENANDO LA TABLA ENVIO *----  */
INSERT INTO envio (codigo, fecha_salida, refugio_id) VALUES
('COL123', '2023-01-01', 1),
('MDE456', '2023-01-15', 2),
('CAL789', '2023-02-14', 3),
('BAQ012', '2023-02-28', 4),
('BUC345', '2023-03-02', 5),
('CTG678', '2023-03-16', 6),
('CUC901', '2023-04-04', 7),
('BHO718', '2023-04-22', 8),
('CUC469', '2023-05-12', 9),
('NEQ013', '2023-05-28', 10);


/*  ----* LLENANDO LA TABLA ENVIO_SEDE *----  */
INSERT INTO envio_sede (sede_id, envio_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);


/*  ----? LLENANDO LA TABLA ENVIO_VOLUNTARIO ?----  */
INSERT INTO envio_voluntario (voluntario_id, envio_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);


/*  ----* LLENANDO LA TABLA ENVIO_MATERIAL *----  */
INSERT INTO envio_material (numero_medicamentos, toneladas, envio_id, material_id) VALUES
(1000, 5, 1, 1),
(NULL, 10, 2, 2),
(NULL, 20, 3, 3),
(500, NULL, 4, 4),
(NULL, 15, 5, 5),
(2000, NULL, 6, 6),
(NULL, NULL, 7, 7),
(NULL, 8, 8, 8),
(3000, NULL, 9, 9),
(NULL, 12, 10, 10);


/*  ----? LLENANDO LA TABLA USUARIOS ?----  */
INSERT INTO usuario (cedula, email, pwd, fecha) VALUES
(1005372613, 'juan.perez@example.com', '', '2023-04-15'),
(80456789, 'maria.rodriguez@example.com', 'clave456', '2023-03-20'),
(12345678, 'carlos.garcia@example.com', 'password789', '2023-02-28'),
(98765432, 'ana.martinez@example.com', 'secreto123', '2023-05-10'),
(45678912, 'root@administrator.com', 'jose', '2023-01-05');

/*  ----* LLENANDO LA TABLA ROLES *----  */
INSERT INTO roles (role_name, description) VALUES 
('ROLE_ADMIN', 'permiso en todo'),
('ROLE_AUXILIAR', 'permisos gestion: socios, voluntarios, envíos'),
('ROLE_DIRECTOR', 'consultar reportes');


/*  ----? LLENANDO LA TABLA USUARIOS_ROLES ?----  */
INSERT INTO usuario_roles (roles_id, usuario_id) VALUES
(2, 1),
(3, 2),
(1, 5);
