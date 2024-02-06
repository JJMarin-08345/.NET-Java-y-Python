-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-12-2022 a las 00:26:27
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `institucion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acceso`
--

CREATE TABLE `acceso` (
  `usuario` varchar(15) NOT NULL,
  `clave` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `acceso`
--

INSERT INTO `acceso` (`usuario`, `clave`) VALUES
('Juan Jose Marin', 'Elmatacabrasñeñeñe');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentadante`
--

CREATE TABLE `cuentadante` (
  `cuentadanteId` int(11) NOT NULL,
  `Documento` varchar(15) NOT NULL,
  `Nombres` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `CantidadEquipos` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentadante`
--

INSERT INTO `cuentadante` (`cuentadanteId`, `Documento`, `Nombres`, `Apellidos`, `Correo`, `Telefono`, `CantidadEquipos`) VALUES
(1, '123456', 'Juan Jose', 'Marin Dominguez', 'juan@gmail.com', '3153580521', 1),
(2, '222', 'Cristian', 'Acosta Lopez', 'juans@gmail.com', '3153931201', 1),
(4, '1109232213', 'Luciana', 'Cortes Garzon', 'LuciCor@gmail.com', '3224560214', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipocomputo`
--

CREATE TABLE `equipocomputo` (
  `EquipoId` int(10) NOT NULL,
  `Serial` varchar(20) NOT NULL,
  `Marca` varchar(15) NOT NULL,
  `Modelo` varchar(15) NOT NULL,
  `Tipo` varchar(18) NOT NULL,
  `FechaCompra` date NOT NULL,
  `VencimientoGarantia` int(10) NOT NULL,
  `UbicacionPCId` int(11) DEFAULT NULL,
  `cuentadanteId` int(11) NOT NULL,
  `ProveedorId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `equipocomputo`
--

INSERT INTO `equipocomputo` (`EquipoId`, `Serial`, `Marca`, `Modelo`, `Tipo`, `FechaCompra`, `VencimientoGarantia`, `UbicacionPCId`, `cuentadanteId`, `ProveedorId`) VALUES
(7, 'KY239DF12MU65', 'ASUS', 'X505B', 'Oficina', '2019-04-10', 24, 1, 1, 1),
(8, 'JTB4521K097', 'LG', 'M515da', 'Estudiantil', '2021-08-03', 24, 1, 4, 3),
(9, '87456206US', 'Lenovo', 'CO302', 'Oficina', '2021-05-06', 48, 3, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partespc`
--

CREATE TABLE `partespc` (
  `Nombre` varchar(20) NOT NULL,
  `PartesPCId` int(11) NOT NULL,
  `Serial` varchar(20) NOT NULL,
  `Partes_Marca` varchar(15) NOT NULL,
  `FechaCompraPartes` date NOT NULL,
  `GarantiaVencePartes` int(10) NOT NULL,
  `EquipoId` int(11) NOT NULL,
  `ProveedorId` int(11) NOT NULL,
  `Ubicacion_Partes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `partespc`
--

INSERT INTO `partespc` (`Nombre`, `PartesPCId`, `Serial`, `Partes_Marca`, `FechaCompraPartes`, `GarantiaVencePartes`, `EquipoId`, `ProveedorId`, `Ubicacion_Partes`) VALUES
('Procesador', 2, '123', 'AMD', '2022-05-02', 24, 8, 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `ProveedorId` int(11) NOT NULL,
  `NIT` varchar(15) NOT NULL,
  `RazonSocial` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Telefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`ProveedorId`, `NIT`, `RazonSocial`, `Direccion`, `Correo`, `Telefono`) VALUES
(1, '123', 'Distri Computo', 'Crra 15 23-12', 'distribuidoraequipo@gmail.com', '3123580523'),
(3, '1890431 ', 'Hard&Soft-ware', 'Cali', 'hadsoft@hotmail.com', '3224671298'),
(4, '31789412434', 'Lg components', 'Cali', 'bogota', '3122340921');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `software`
--

CREATE TABLE `software` (
  `SoftwareId` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Version` varchar(10) DEFAULT NULL,
  `InstalationKey` varchar(15) NOT NULL,
  `CantidadLicencias` int(11) NOT NULL,
  `Vigencia` int(11) NOT NULL,
  `ProveedorId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `software`
--

INSERT INTO `software` (`SoftwareId`, `Nombre`, `Version`, `InstalationKey`, `CantidadLicencias`, `Vigencia`, `ProveedorId`) VALUES
(1, 'windows', '10', 'JLO9 UQW7 KLAS', 2, 24, 1),
(2, 'Office', '2019', 'SWO9-PW81-I71E', 10, 12, 1),
(3, 'windows', '8', 'JLO9 UQW7 KLAS', 4, 24, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ubicacionpartes`
--

CREATE TABLE `ubicacionpartes` (
  `UbicacionPartesId` int(11) NOT NULL,
  `Descripcion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ubicacionpartes`
--

INSERT INTO `ubicacionpartes` (`UbicacionPartesId`, `Descripcion`) VALUES
(1, 'CPU'),
(2, 'Placa de video');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ubicacion_pc`
--

CREATE TABLE `ubicacion_pc` (
  `UbicacionPCId` int(11) NOT NULL,
  `Descripcion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ubicacion_pc`
--

INSERT INTO `ubicacion_pc` (`UbicacionPCId`, `Descripcion`) VALUES
(1, 'ninguna'),
(3, 'Admin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cuentadante`
--
ALTER TABLE `cuentadante`
  ADD PRIMARY KEY (`cuentadanteId`);

--
-- Indices de la tabla `equipocomputo`
--
ALTER TABLE `equipocomputo`
  ADD PRIMARY KEY (`EquipoId`),
  ADD KEY `fkUbiPc` (`UbicacionPCId`) USING BTREE,
  ADD KEY `fk_CueId` (`cuentadanteId`),
  ADD KEY `fk_proId` (`ProveedorId`);

--
-- Indices de la tabla `partespc`
--
ALTER TABLE `partespc`
  ADD PRIMARY KEY (`PartesPCId`),
  ADD KEY `ProveedorId` (`ProveedorId`),
  ADD KEY `EquipoId` (`EquipoId`) USING BTREE,
  ADD KEY `fkUbiPartesPC` (`Ubicacion_Partes`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ProveedorId`);

--
-- Indices de la tabla `software`
--
ALTER TABLE `software`
  ADD PRIMARY KEY (`SoftwareId`),
  ADD KEY `Proveedor` (`ProveedorId`);

--
-- Indices de la tabla `ubicacionpartes`
--
ALTER TABLE `ubicacionpartes`
  ADD PRIMARY KEY (`UbicacionPartesId`);

--
-- Indices de la tabla `ubicacion_pc`
--
ALTER TABLE `ubicacion_pc`
  ADD PRIMARY KEY (`UbicacionPCId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuentadante`
--
ALTER TABLE `cuentadante`
  MODIFY `cuentadanteId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `equipocomputo`
--
ALTER TABLE `equipocomputo`
  MODIFY `EquipoId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `partespc`
--
ALTER TABLE `partespc`
  MODIFY `PartesPCId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `ProveedorId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `software`
--
ALTER TABLE `software`
  MODIFY `SoftwareId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ubicacionpartes`
--
ALTER TABLE `ubicacionpartes`
  MODIFY `UbicacionPartesId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ubicacion_pc`
--
ALTER TABLE `ubicacion_pc`
  MODIFY `UbicacionPCId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `equipocomputo`
--
ALTER TABLE `equipocomputo`
  ADD CONSTRAINT `fkUbiPc` FOREIGN KEY (`UbicacionPCId`) REFERENCES `ubicacion_pc` (`UbicacionPCId`),
  ADD CONSTRAINT `fk_CueId` FOREIGN KEY (`cuentadanteId`) REFERENCES `cuentadante` (`cuentadanteId`),
  ADD CONSTRAINT `fk_proId` FOREIGN KEY (`ProveedorId`) REFERENCES `proveedor` (`ProveedorId`);

--
-- Filtros para la tabla `partespc`
--
ALTER TABLE `partespc`
  ADD CONSTRAINT `fkUbiPartesPC` FOREIGN KEY (`Ubicacion_Partes`) REFERENCES `ubicacionpartes` (`UbicacionPartesId`),
  ADD CONSTRAINT `partespc_ibfk_1` FOREIGN KEY (`EquipoId`) REFERENCES `equipocomputo` (`EquipoId`),
  ADD CONSTRAINT `partespc_ibfk_2` FOREIGN KEY (`ProveedorId`) REFERENCES `proveedor` (`ProveedorId`);

--
-- Filtros para la tabla `software`
--
ALTER TABLE `software`
  ADD CONSTRAINT `software_ibfk_1` FOREIGN KEY (`ProveedorId`) REFERENCES `proveedor` (`ProveedorId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
