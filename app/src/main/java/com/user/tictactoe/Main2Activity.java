package com.user.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    TextView moveTextView;
    int turn;

    int scoreXPlayer = 0;
    int score0Player = 0;

    public Main2Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.reset_button);
        moveTextView = (TextView) findViewById(R.id.moveTextView);


        turn = 1;
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b1.getText().toString().equals("")) {
                                          switch (view.getId()) {
                                              case R.id.b1:
                                          }
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
                                      switch (view.getId()) {
                                          case R.id.b2:
                                      }
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
                                          switch (view.getId()) {
                                              case R.id.b3:
                                          }
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
                                      switch (view.getId()) {
                                          case R.id.b4:
                                      }
                                      if (b4.getText().toString().equals("")) {
                                          if (turn == 1) {
                                              turn = 2;
                                              b4.setText("X");
                                          } else if (turn == 2) {
                                              turn = 1;
                                              b4.setText("0");
                                          }
                                      }
                                      endGame();
                                  }
                              }
        );

        b5.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      if (b5.getText().toString().equals("")) {
                                          switch (view.getId()) {
                                              case R.id.b5:
                                          }
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
                                      switch (view.getId()) {
                                          case R.id.b6:
                                      }
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
                                      switch (view.getId()) {
                                          case R.id.b7:
                                      }
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
                                          switch (view.getId()) {
                                              case R.id.b8:
                                          }
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
                                      switch (view.getId()) {
                                          case R.id.b9:
                                      }
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
    }

    public void endGame() {
        String a, b, c, d, e, f, g, h, i;

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



      /*
         * Dialog box display for XPlayer winning
         */

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }


        if (g.equals("X") && b.equals("X") && i.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }

        if (b.equals("X") && e.equals("X") && h.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }

        if (c.equals("X") && f.equals("X") && i.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }


        if (a.equals("X") && e.equals("X") && i.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }


        if (c.equals("X") && e.equals("X") && g.equals("X")) {
 /*
     * This method add one point for X Player
     */
            scoreXPlayer = scoreXPlayer + 1;
            displayForXPlayer(scoreXPlayer);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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
         * Dialog box display for 0Player winning
         */

        if (a.equals("0") && b.equals("0") && c.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (d.equals("0") && e.equals("0") && f.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }


        if (g.equals("0") && b.equals("0") && i.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
        if (a.equals("0") && d.equals("0") && g.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }

        if (b.equals("0") && e.equals("0") && h.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }

        if (c.equals("0") && f.equals("0") && i.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }


        if (a.equals("0") && e.equals("0") && i.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }


        if (c.equals("0") && e.equals("0") && g.equals("0")) {
 /*
     * This method add one point for 0 Player
     */
            score0Player = score0Player + 1;
            displayFor0Player(score0Player);

            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);
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


                        }
                    });
            dlgAlert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            dlgAlert.create().show();

        }
    }


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
