DROP SCHEMA IF EXISTS `lb` ;
CREATE SCHEMA IF NOT EXISTS `lb` DEFAULT CHARACTER SET latin1 ;
USE `lb` ;

-- -----------------------------------------------------
-- Table `lb`.`departamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lb`.`departamento` (
  `iddepartamento` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`iddepartamento`))
ENGINE = InnoDB
COMMENT = '\n';


-- -----------------------------------------------------
-- Table `lb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lb`.`usuario` (
  `idusuario` INT NOT NULL,
  `iddepartamento` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `perfil` INT NULL,
  `email` VARCHAR(45) NULL,
  `login` VARCHAR(45) NULL,
  `senha` VARCHAR(45) NULL,
  `dica` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuario`, `iddepartamento`),
  INDEX `fk_usuarios_departamentos_idx` (`iddepartamento` ASC),
  CONSTRAINT `fk_usuarios_departamentos`
    FOREIGN KEY (`iddepartamento`)
    REFERENCES `lb`.`departamento` (`iddepartamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lb`.`autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lb`.`autor` (
  `idautor` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `dtnasc` VARCHAR(10) NULL,
  `sexo` CHAR(1) NULL,
  `cpf` VARCHAR(14) NULL,
  PRIMARY KEY (`idautor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lb`.`orientador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lb`.`orientador` (
  `idorientador` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `sexo` CHAR(1) NOT NULL,
  `cpf` VARCHAR(15) NULL,
  PRIMARY KEY (`idorientador`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lb`.`trabalho`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lb`.`trabalho` (
  `idtrabalho` INT NOT NULL,
  `idautor` INT NOT NULL,
  `idorientador` INT NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `issn` VARCHAR(9) NOT NULL,
  `resumo` TEXT NOT NULL,
  `palavrasChaves` VARCHAR(45) NOT NULL,
  `ano` INT NOT NULL,
  `curso` VARCHAR(45) NULL,
  `descricao` TEXT NULL,
  `tipo` INT NOT NULL,
  PRIMARY KEY (`idtrabalho`, `idautor`, `idorientador`),
  INDEX `fk_trabalho_autor1_idx` (`idautor` ASC),
  INDEX `fk_trabalho_orientador1_idx` (`idorientador` ASC),
  CONSTRAINT `fk_trabalho_autor1`
    FOREIGN KEY (`idautor`)
    REFERENCES `lb`.`autor` (`idautor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_trabalho_orientador1`
    FOREIGN KEY (`idorientador`)
    REFERENCES `lb`.`orientador` (`idorientador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

