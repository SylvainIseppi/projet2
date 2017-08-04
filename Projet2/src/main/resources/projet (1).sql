-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 04 Août 2017 à 16:21
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `projet`
--

-- --------------------------------------------------------

--
-- Structure de la table `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codeCategorie` int(11) NOT NULL,
  `Categorie` varchar(50) NOT NULL,
  `designation` varchar(150) NOT NULL,
  `quantitestock` int(11) NOT NULL,
  `prixUnitaire` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `categorie` (`codeCategorie`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `article`
--

INSERT INTO `article` (`id`, `codeCategorie`, `Categorie`, `designation`, `quantitestock`, `prixUnitaire`) VALUES
(2, 1, '', 'frigo', 25, 250),
(3, 2, '', 'hand spinner', 3000, 10),
(4, 3, '', 'ps4', 500, 499),
(5, 3, '', 'xboxOne', 500, 499),
(6, 4, '', 'pc', 950, 499);

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE IF NOT EXISTS `categorie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `categorie`
--

INSERT INTO `categorie` (`id`, `libelle`) VALUES
(1, 'electromenager'),
(2, 'useless'),
(3, 'jeux'),
(4, 'vrai gamer');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `dateCreation` date NOT NULL,
  `cartedefidélité` tinyint(1) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `adresse` varchar(150) NOT NULL,
  `fixe` int(10) NOT NULL,
  `mobile` int(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `remarques` varchar(400) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`code`, `dateCreation`, `cartedefidélité`, `prenom`, `nom`, `adresse`, `fixe`, `mobile`, `email`, `remarques`) VALUES
(1, '2017-07-06', 0, 'sylvain', 'iseppi', '159 rue jules guesde', 320202020, 669699191, 'sylvain.iseppi@gmail.com', 'createur de la requete'),
(2, '0000-00-00', 1, 'rudy', 'plessis', '159 blabla', 669917653, 669917653, 'rudy@gmail.com', 'remarque'),
(4, '2017-07-25', 1, 'rudy', 'seisel', '159 blabla', 669917653, 669917653, 'rudy@gmail.com', 'remarque');

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE IF NOT EXISTS `commande` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(50) NOT NULL,
  `idclient` int(11) NOT NULL,
  `datecommande` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `client` (`idclient`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `commande`
--

INSERT INTO `commande` (`id`, `libelle`, `idclient`, `datecommande`) VALUES
(1, 'VBCKSB5', 1, '2016-10-25'),
(2, 'VFSDFCS25', 2, '2015-02-25'),
(3, 'nlcsn45', 4, '2012-10-25'),
(4, 'NLKNDSJNKJL52', 1, '2017-07-26');

-- --------------------------------------------------------

--
-- Structure de la table `commandecreer`
--

CREATE TABLE IF NOT EXISTS `commandecreer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcommande` int(11) NOT NULL,
  `idArticle` int(11) NOT NULL,
  `quantité` int(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `article` (`idArticle`),
  KEY `commande` (`idcommande`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `commandecreer`
--

INSERT INTO `commandecreer` (`id`, `idcommande`, `idArticle`, `quantité`) VALUES
(1, 1, 2, 4),
(2, 1, 3, 4),
(3, 2, 2, 10),
(4, 2, 5, 1),
(6, 3, 2, 4),
(7, 1, 6, 4),
(9, 4, 2, 3);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `pass` varchar(250) NOT NULL,
  `role` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `login`, `pass`, `role`) VALUES
(1, 'daksyl', 'blabla', 5);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `commande`
--
ALTER TABLE `commande`
  ADD CONSTRAINT `client` FOREIGN KEY (`idclient`) REFERENCES `client` (`code`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `commandecreer`
--
ALTER TABLE `commandecreer`
  ADD CONSTRAINT `article` FOREIGN KEY (`idArticle`) REFERENCES `article` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `commande` FOREIGN KEY (`idcommande`) REFERENCES `commande` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
