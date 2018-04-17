package com.user.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ExpertMode extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, resetbtn;

    int turn;

    int scoreXPlayer = 0;
    int score0Player = 0;
    private AlertDialog.Builder dlgAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert_mode);


        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        b17 = (Button) findViewById(R.id.button17);
        b18 = (Button) findViewById(R.id.button18);
        b19 = (Button) findViewById(R.id.button19);
        b20 = (Button) findViewById(R.id.button20);
        b21 = (Button) findViewById(R.id.button21);
        b22 = (Button) findViewById(R.id.button22);
        b23 = (Button) findViewById(R.id.button23);
        b24 = (Button) findViewById(R.id.button24);
        b25 = (Button) findViewById(R.id.button25);
        resetbtn = (Button) findViewById(R.id.reset_button);

        turn = 1;

        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b1.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b1.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b1.setText("0");
                                          }
                                      }
                                      endGame();

                                  }

                              }
        );

        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b2.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b2.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b2.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b3.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b3.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b3.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b4.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b4.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b4.setText("0");
                                          }
                                      }
                                  }
                              }
        );
        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b5.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b5.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b5.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b6.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b6.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b6.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b7.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b7.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b7.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b7.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b8.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b8.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b8.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b8.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b9.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b9.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b9.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b9.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b10.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b10.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b10.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b10.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );

        b11.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b11.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b11.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b11.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );

        b12.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b12.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b12.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b12.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b13.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b13.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b13.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b13.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b14.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b14.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b14.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b14.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );

        b15.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b15.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b15.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b15.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b16.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b16.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b16.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b16.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );

        b17.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b17.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b17.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b17.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b18.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b18.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b18.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b18.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b19.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b19.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b19.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b19.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );

        b20.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b20.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b20.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b20.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b21.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b21.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b21.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b21.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );

        b22.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b22.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b22.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b22.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b23.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b23.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b23.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b23.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
        b24.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b24.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b24.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b24.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );

        b25.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (b25.getText().toString().equals("")) {
                                           if (turn == 1) {
                                               turn = 2;
                                               b25.setText("X");
                                           } else if (turn == 2) {
                                               turn = 1;
                                               b25.setText("0");
                                           }
                                       }
                                       endGame();
                                   }
                               }
        );
    }

    public void endGame(){
        String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y;

        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();

        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        j = b10.getText().toString();

        k = b11.getText().toString();
        l = b12.getText().toString();
        m = b13.getText().toString();
        n = b14.getText().toString();
        o = b15.getText().toString();

        p = b16.getText().toString();
        q = b17.getText().toString();
        r = b18.getText().toString();
        s = b19.getText().toString();
        t = b20.getText().toString();

        u = b21.getText().toString();
        v = b22.getText().toString();
        w = b23.getText().toString();
        x = b24.getText().toString();
        y = b25.getText().toString();


        /*
         * Toast display for XPlayer winning
         */

        if (f.equals("X") && k.equals("X") && p.equals("X") && u.equals("X") && a.equals("X")){
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (b.equals("X") && g.equals("X") && l.equals("X") && q.equals("X") && v.equals("X")){

             /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }

        if (c.equals("X") && h.equals("X") && m.equals("X") && r.equals("X") && w.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }

        if (d.equals("X") && i.equals("X") && n.equals("X") && s.equals("X") && x.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (e.equals("X") && j.equals("X") && o.equals("X") && t.equals("X") && y.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (a.equals("X") && b.equals("X") && c.equals("X") && d.equals("X") && e.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }

        if (e.equals("X") && i.equals("X") && m.equals("X") && q.equals("X") && u.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (f.equals("X") && g.equals("X") && h.equals("X") && i.equals("X") && j.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (k.equals("X") && l.equals("X") && m.equals("X") && n.equals("X") && o.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (p.equals("X") && q.equals("X") && r.equals("X") && s.equals("X") && t.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (u.equals("X") && v.equals("X") && w.equals("X") && x.equals("X") && y.equals("X")){
  /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }







        /*
         * Toast display for 0Player winning
         */
        if (a.equals("0") && g.equals("0")&& m.equals("0") && s.equals("0") && y.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (i.equals("0") && m.equals("0") && q.equals("0") && u.equals("0") && a.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }

        if (f.equals("0") && k.equals("0") && p.equals("0") && u.equals("0") && a.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (b.equals("0") && g.equals("0") && l.equals("0") && q.equals("0") && v.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }

        if (c.equals("0") && h.equals("0") && m.equals("0") && r.equals("0") && w.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }

        if (d.equals("0") && i.equals("0") && n.equals("0") && s.equals("0") && x.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (e.equals("0") && j.equals("0") && o.equals("0") && t.equals("0") && y.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (a.equals("0") && b.equals("0") && c.equals("0") && d.equals("0") && e.equals("X")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (f.equals("0") && g.equals("0") && h.equals("0") && i.equals("0") && j.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (k.equals("0") && l.equals("0") && m.equals("0") && n.equals("0") && o.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }if (p.equals("0") && q.equals("0") && r.equals("0") && s.equals("0") && t.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }

        if (u.equals("0") && v.equals("0") && w.equals("0") && x.equals("0") && y.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (a.equals("0") && g.equals("0")&& m.equals("0") && s.equals("0") && y.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (i.equals("0") && m.equals("0") && q.equals("0") && u.equals("0") && a.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }
        if (a.equals("0") && b.equals("0") && c.equals("0") && d.equals("0") && e.equals("0")){
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("0 Player wins!");
            dlgAlert.setTitle("congratulations");
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Next Game",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            b1.setText("");
                            b2.setText("");
                            b3.setText("");
                            b4.setText("");
                            b5.setText("");
                            b6.setText("");
                            b7.setText("");
                            b8.setText("");
                            b9.setText("");
                            b10.setText("");
                            b11.setText("");
                            b12.setText("");
                            b13.setText("");
                            b14.setText("");
                            b15.setText("");
                            b16.setText("");
                            b17.setText("");
                            b18.setText("");
                            b19.setText("");
                            b20.setText("");
                            b21.setText("");
                            b22.setText("");
                            b23.setText("");
                            b24.setText("");
                            b25.setText("");

                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();


        }



        if(end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);

        }
    }
    public void Next_Game(View view) {
       b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b16.setText("");
        b17.setText("");
        b18.setText("");
        b19.setText("");
        b10.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");

    }

    //public void reset_button(View v) {
       // Intent myIntent = new Intent(ExpertMode.this, ExpertMode.class);
        //ExpertMode.this.startActivity(myIntent);
    //}

    //
    /*
     * This method add one point for X Player
     */
    public void addOneForXPlayer(View view) {
        scoreXPlayer = scoreXPlayer + 1;
        displayFor0Player(scoreXPlayer);
    }

    /*
     * This method add one point for 0 player
     */
    public void addOneFor0Player(View view) {
        score0Player = score0Player + 1;
        displayFor0Player(score0Player);
    }

    /*
     * This method reset player 0 and x to zero.
     */
    public void reset_button(View view) {
        displayForXPlayer(0);
        displayFor0Player(0);
        scoreXPlayer = 0;
        score0Player = 0;
        b4.getText().toString().equals(" ");
    }
    /*
     * Displays the given score for X Player.
     */
    public void displayForXPlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.dislayForXPlayer);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * Displays the given score for 0 Player.
     */
    public void displayFor0Player(int score) {
        TextView scoreView = (TextView) findViewById(R.id.dislayFor0Player);
        scoreView.setText(String.valueOf(score));
    }
}