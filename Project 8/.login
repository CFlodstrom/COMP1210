#####################################################################################
##
## .login file for user-setup version 2
##
##  This file contains commands which will be executed in login
##  shells.  Primarily it is used to start your favorite window
##  system.  The window system start command should be set in
##  the .cshrc file as the variable START_WINDOWS_CMD
##
## @(#)Login	2.3	1/7/93	Auburn University Engineering
#####################################################################################

## Check to see if we are on a Sun console.  If not, then assume we
## are logging in over a modem or from accross the network and set
## the default terminal type to VT-102.
if ($TERM != "sun" && $TERM != "sun-cmd") then
	set noglob
	eval `tset -sQ -m dialup:\?vt102 -m network:\?vt102 -m dumb:\?vt102 $TERM`
	unset noglob
endif

## If we are not logged into the console then we can finish now.
if (`tty` != "/dev/console") exit

## We are logged into the console, so try and start the window system.
if ($?START_WINDOWS_CMD == 0) then
	echo "No window system has been selected.  Entering terminal interface."
	exit
endif

### set the number of seconds to delay before starting window system
set delay = 5

#### read the system messages
readmotd

echo -n "Starting window system (Control C to abort)"
while ( $delay > 0)
	echo -n " $delay"; sleep 1
	@ delay --
end
echo " go"

$START_WINDOWS_CMD

## Cleanup after exiting the window system.
clear_colormap
kbd_mode -a
logout
