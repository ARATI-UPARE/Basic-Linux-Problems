    #! /bin/bash -x

# Create envirnoment varibale usersecret if it not present in env file

value=`env|grep -i USERSECRET`;

if [ -z "$value" ]
then
	 export usersecret=dH34xJaa23;
else
	echo"Error : Already present"; 
fi


