package dominion481.server;

public enum ClientServerAction implements Action {
   NICK("nick") {
      @Override
      public void handle(String[] args, ClientHandlerThread thread) {
         // TODO Add nick uniqueness check
         if (args.length < 2)
            thread.out.println("tooFewArguments");
         else {
            thread.out.println("serverRename " + thread.nick + " " + args[1]);
            thread.nick = args[1];
         }
      }
   },
   GETGAMES("getGames") {
      @Override
      public void handle(String[] args, ClientHandlerThread thread) {
         ;
      }
   },
   GETLOBBIES("getLobbies") {
      @Override
      public void handle(String[] args, ClientHandlerThread thread) {
         ;
      }
   },
   STARTLOBBY("startLobby") {
      @Override
      public void handle(String[] args, ClientHandlerThread thread) {
         ;
      }
   },
   JOINLOBBY("joinLobby") {
      @Override
      public void handle(String[] args, ClientHandlerThread thread) {
         ;
      }
   };

   String[] name;

   ClientServerAction(String... n) {
      this.name = n;
   }
}