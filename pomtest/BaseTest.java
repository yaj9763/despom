????   4 ?  pomtest/BaseTest  java/lang/Object driver Lorg/openqa/selenium/WebDriver; lp Lpompage/LoginPage; <init> ()V Code
   	 
 LineNumberTable LocalVariableTable this Lpomtest/BaseTest; 
initDriver 
Exceptions  java/io/IOException RuntimeVisibleAnnotations $Lorg/testng/annotations/BeforeSuite;  webdriver.chrome.driver  ;C:\Users\Suraj\Desktop\Velocity\5.Softwear\chromedriver.exe
    java/lang/System   ! setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; # 'org/openqa/selenium/chrome/ChromeDriver
 " 	  &   ( *https://opensource-demo.orangehrmlive.com/ * , + org/openqa/selenium/WebDriver - . get (Ljava/lang/String;)V objectCreation $Lorg/testng/annotations/BeforeClass; 2 pompage/LoginPage
 1 4 	 5 "(Lorg/openqa/selenium/WebDriver;)V	  7   teardown #Lorg/testng/annotations/AfterSuite; * ; < 
 quit 
SourceFile BaseTest.java !                  	 
     /     *? ?                          
                   S     ? W? "Y? $? %? %'? ) ?                  #              / 
       0      =     *? 1Y? %? 3? 6?       
    )  +              8 
       9      7     	? %? : ?       
    0  2        	      =    >