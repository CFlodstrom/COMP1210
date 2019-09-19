################################################################################
##
##	.cshrc file
##
##	The .cshrc file contains which affect the user environment.  This
##	file is sourced when you log in and once for every window you
##	start.  This is the place where the majority of the customizations
##	for your Sun workstation environment are made.
##
##	This file is generated automatically for new users the first time
## 	they log in.  You should be able to run the program "user-setup"
##	at any time to reconfigure this file.  The user-setup program
##	is interactive and will ask you questions about what software
##	you intend to run.  The user-setup program will be aware of all
##	currently installed major software packages available on the
##	College of Engineering network.
##
##	This file can be edited by hand to suit your tastes.  There is a
##	section called "personal customization area" which should contain
##	your personal additions.  Any commands placed in the "personal 
##	customization area" will be automatically included in any new
##	.cshrc file created by "user-setup".  This area is near the bottom
##	of this file so that you could override any setup done by 
##	user-setup.
##
##	More information on C-shells and .cshrc files can be found in the
##	man pages for csh.  Type "man csh".
##
##
## @(#)prologue.cshrc	2.4	8/20/93	Auburn University Engineering

######  switches and variables
set noclobber
set ignoreeof
set notify
set history=40
umask 077

##  The limits set here are intended to cut down on users accidently
##  tying up system resources.  See the man page on csh for more info.
##  DO NOT CHANGE THESE!  If you wish to make changes, copy them into the
##  personal-customization area below.
limit cputime 1h      ## cputime limit 1 hour
limit filesize 4m     ## filesize limit to 4 megabytes
limit coredumpsize 0  ## don't make core files

setenv MAIL /var/spool/mail/`echo $USER | cut -c1`/`echo $USER | cut -c2`/$USER
##
## Now we are ready to look for modules.  Each module adds an application
## to the environment.  You can add or remove modules on the fly.  See
## the man page on modules for more information.
##
if ( -d /usr/modules) then
	source /usr/modules/init/csh
	set path = ""
	## the following line loads all initial modules.
	module load unix/sysv win/openwin/3.0
	if ( $status != 0 ) then
		echo "WARNING: couldn't load modules.  Entering generic environment."
		set path = (/usr/bin /usr/ucb /opt/local/bin .)
	endif
else
	set path = (/usr/bin /usr/ucb /opt/local/bin .)
	echo "WARNING: couldn't load modules.  Entering generic environment."
endif
if ( $#path < 4 ) then
	echo "WARNING: path doesn't appear to be set properly.  Adjusting."
	set path = (/usr/bin /usr/ucb /opt/local/bin $path .)
endif

## Place any personal changes in this section and they will remain
## intact the next time you run user-setup.
## DO NOT CHANGE THE NEXT LINE!!!!
##  ----start-personal-customization-area----
## @(#)default.customization	2.2	6/16/92	Auburn University Engineering
## everything here will be executed for each shell including remote shells

##  skip remaining setup if not an interactive shell
if ($?USER == 0 || $?prompt == 0) exit

## everything from here on will be executed if this is an interactive
## shell (such as a terminal window)

# set the prompt to shoe: hostname/username/history
set prompt="`hostname`{`whoami`}\!: "

# useful aliases
alias cd        'cd \!*;echo $cwd'  # show new directory path after cd
alias cp        'cp -i'    # don't overwrite existing files without ok
alias mv        'mv -i'    # don't overwrite existing files without ok
alias rm        'rm -i'    # don't overwrite existing files without ok
alias pwd       'echo $cwd'

# make the floppy drive be the default device for tapetool and bar.
setenv TAPE /dev/rfd0c
##  ----end-personal-customization-area----
## DO NOT CHANGE THE PREVIOUS LINE!!!! 
############################################################################
##
## @(#)epilogue.cshrc	2.2	9/17/93	Auburn University Engineering
##
############################################################################
## end of .cshrc file
