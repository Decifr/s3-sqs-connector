{
  description = "Spark SQS Receiver";
  inputs = {
    nixpkgs.url = github:NixOS/nixpkgs/nixpkgs-unstable;
    flake-utils.url = github:numtide/flake-utils;
  };

  outputs = { self, nixpkgs, flake-utils }:
    let
      nixpkgsFor = system: import nixpkgs { inherit system; };
    in
    flake-utils.lib.eachDefaultSystem (system:
      let
        pkgs = nixpkgsFor system;
      in
      {
        devShells.default = pkgs.mkShell {
          buildInputs = with pkgs; [
            awscli2
            jdk11
            just
            sbt
            scala

            # Formatteres
            nodePackages.prettier
            shfmt
            scalafmt
            treefmt
          ];
          shellHook = ''
          '';
        };
      });
}

