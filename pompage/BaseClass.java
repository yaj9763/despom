����   4 @  pompage/BaseClass  java/lang/Object prop Ljava/util/Properties; fis Ljava/io/FileInputStream; <init> ()V 
Exceptions  java/io/IOException Code
   	 
  java/util/Properties
  	      java/io/FileInputStream  java/lang/StringBuilder  user.dir
    java/lang/System   ! getProperty &(Ljava/lang/String;)Ljava/lang/String;
 # % $ java/lang/String & ' valueOf &(Ljava/lang/Object;)Ljava/lang/String;
  ) 	 * (Ljava/lang/String;)V , \Config.properties
  . / 0 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
  2 3 4 toString ()Ljava/lang/String;
  )
  7 8 9 load (Ljava/io/InputStream;)V LineNumberTable LocalVariableTable this Lpompage/BaseClass; 
SourceFile BaseClass.java !                    	 
           {     7*� *� Y� � � Y� Y� � "� (+� -� 1� 5L*� +� 6�    :            .  6  ;       7 < =   . 	     >    ?