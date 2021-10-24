-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 23 mai 2019 à 22:06
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `monitoring`
--

-- --------------------------------------------------------

--
-- Structure de la table `domaine`
--

DROP TABLE IF EXISTS `domaine`;
CREATE TABLE IF NOT EXISTS `domaine` (
  `id_domaine` bigint(20) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_domaine`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `domaine`
--

INSERT INTO `domaine` (`id_domaine`, `nom`) VALUES
(5, 'hana'),
(2, 'eh'),
(3, 'eh'),
(4, 'hi'),
(6, 'hana'),
(7, 'hana'),
(8, 'hana');

-- --------------------------------------------------------

--
-- Structure de la table `fmkflow`
--

DROP TABLE IF EXISTS `fmkflow`;
CREATE TABLE IF NOT EXISTS `fmkflow` (
  `flowid` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `dest` varchar(255) DEFAULT NULL,
  `flowcode` varchar(255) DEFAULT NULL,
  `src` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`flowid`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fmkflow`
--

INSERT INTO `fmkflow` (`flowid`, `description`, `dest`, `flowcode`, `src`) VALUES
(1, 'ff', 'ff', 'ff', 'ff');

-- --------------------------------------------------------

--
-- Structure de la table `fmkhalfflow`
--

DROP TABLE IF EXISTS `fmkhalfflow`;
CREATE TABLE IF NOT EXISTS `fmkhalfflow` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `flowcode` varchar(255) DEFAULT NULL,
  `halfflowcode` varchar(255) DEFAULT NULL,
  `src` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fmklog`
--

DROP TABLE IF EXISTS `fmklog`;
CREATE TABLE IF NOT EXISTS `fmklog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `logcode` varchar(255) DEFAULT NULL,
  `typecode` varchar(255) DEFAULT NULL,
  `typelog` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fmklog`
--

INSERT INTO `fmklog` (`id`, `description`, `logcode`, `typecode`, `typelog`) VALUES
(1, 'hh', 'hh55', 'yy', 'yy');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(9),
(9);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `login`, `nom`, `password`, `prenom`) VALUES
(1, 'ss', 'ss', 'ss', 'ss');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
