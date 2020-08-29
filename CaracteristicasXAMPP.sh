#!/bin/bash


# modificar menu segun las opciones...

while : 
do
        opcion="" #variable a utilizar.-
        clear;
        echo "+----------------------------------------------+"
	echo "|              SERVICIOS DE XAMPP              |"
        echo "+----------------------------------------------+"
        echo "|                Menu Principal                |"
        echo "+----------------------------------------------+"
        echo "| (1) - Iniciar Servidor Web                   |"
        echo "| (2) - Reiniciar Servidor Web                 |"
	echo "| (3) - Detener Servidor Web                   |"
	echo "+----------------------------------------------+"
        echo "| (4) - Iniciar servicio MySQL                 |"
	echo "| (5) - Reiniciar Servicio MySQL               |"
	echo "| (6) - Detener Servicio MySQL                 |"
	echo "+----------------------------------------------+"
        echo "| (0) - Salir                                  |"
        echo "+----------------------------------------------+"
        echo ""; read -p "Su opcion: " opcion

	case "$opcion" in
		
		1)
			# opcion 1...
		;;

		2)
		;;
		
		3)
		;;

		4)
		;;

		5)
		;;

		6)
		;;

		0)
			break;
		;;

		*)	
			# "mensaje de error . . ."
		;;
	esac

done


