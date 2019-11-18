module fairy.banish.jenkins{
	opens com.lee.fairy.banish;
	opens com.lee.fairy.banish.controller;
	
	requires java.instrument;
	requires spring.boot;
	requires spring.beans;
	requires spring.core;
	requires spring.context;
	requires spring.web;
	requires spring.boot.autoconfigure;
}