����   4 ;  pompage/LoginPage  java/lang/Object driver Lorg/openqa/selenium/WebDriver; username  Lorg/openqa/selenium/WebElement; RuntimeVisibleAnnotations $Lorg/openqa/selenium/support/FindBy; xpath //*[@id='txtUsername'] password //*[@id='txtPassword'] loginbutton //*[@id='btnLogin'] <init> "(Lorg/openqa/selenium/WebDriver;)V Code
     ()V	    
    'org/openqa/selenium/support/PageFactory   initElements 4(Lorg/openqa/selenium/WebDriver;Ljava/lang/Object;)V LineNumberTable LocalVariableTable this Lpompage/LoginPage; loginWithCorrectCred	  %   ' java/lang/CharSequence ) Admin + - , org/openqa/selenium/WebElement . / sendKeys ([Ljava/lang/CharSequence;)V	  1   3 admin123	  5   + 7 8  click 
SourceFile LoginPage.java !                 	     
  s       	     
  s       	     
  s          O     *� *+� +*� �              	             ! "          #      d     .*� $� &Y(S� * *� 0� &Y2S� * *� 4� 6 �           !  " $ # - $         . ! "    9    :