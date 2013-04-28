Mineplayers is a simple plugin that adds some AFK and welcome message functionality
to CraftBukkit (and thus Minecraft). It lets users mark themselves as Away From Keyboard
(as well as automatically detecting this), plus it sends a list of players when
a user logs on to the server (saving them from having to issue a /list command themselves).

## Building

To build Mineplayers you'll need a Java compiler and Maven 2.2 or later. Perform
the following:

1. Clone the Mineplayers Git repository:
   `git clone git://github.com/SiebeTolsma/Mineplayers.git`
2. Run Maven to build:
   `mvn clean package`

## Developing

Mineplayers welcomes contributions in the form of pull requests and issue reports. 
If you feel like working on Mineplayers, just fork the repository and start working. 
Once you're done, submit a pull request.

Note that only pulls that adhere to the current coding styles are accepted. In 
short, put braces on a new line, use four spaces for indent, and at a minimum 
put a short Javadoc comment on each method.

## License

Copyright (C) 2013 Siebe Tolsma

This software is provided 'as-is', without any express or implied
warranty. In no event will the authors be held liable for any damages
arising from the use of this software.

Permission is granted to anyone to use this software for any purpose,
including commercial applications, and to alter it and redistribute it
freely, subject to the following restrictions:

1. The origin of this software must not be misrepresented; you must not
   claim that you wrote the original software. If you use this software
   in a product, an acknowledgment in the product documentation would be
   appreciated but is not required.
2. Altered source versions must be plainly marked as such, and must not be
   misrepresented as being the original software.
3. This notice may not be removed or altered from any source distribution.

Siebe Tolsma
siebe@bot2k3.net