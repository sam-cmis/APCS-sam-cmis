else{
                for (int b = 0; b < w; b++){
                    output += ","; 
                }
                if (b == 0 || b == w +1){
                    output += "|";
                }
                else if ( (b+a) % 2 == 0) {
                    while ((roll + column) % 2 != 0){
                        roll = (int)(Math.random() * ((h - 1) + 1)) + 1;
                        column = (int)(Math.random() * ((w - 1) + 1)) + 1;
                    }
                    if (a == roll && b == column){
                        output += num;
                    }else{
                        output += "#";
                    }
                }else if ( (b+a) % 2 == 1){
                    output += " ";
                }