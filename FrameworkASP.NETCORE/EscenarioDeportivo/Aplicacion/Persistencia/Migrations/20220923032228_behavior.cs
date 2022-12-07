using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Persistencia.Migrations
{
    public partial class behavior : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Arbitros_ColegiosInstrucciones_ColegioInstruccionId",
                table: "Arbitros");

            migrationBuilder.CreateIndex(
                name: "IX_UnidadesDeportivas_Nombre",
                table: "UnidadesDeportivas",
                column: "Nombre",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_Torneos_Nombre",
                table: "Torneos",
                column: "Nombre",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_Patrocinadores_Documento",
                table: "Patrocinadores",
                column: "Documento",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_Escenarios_Nombre",
                table: "Escenarios",
                column: "Nombre",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_Equipos_Nombre",
                table: "Equipos",
                column: "Nombre",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_Entrenadores_Documento",
                table: "Entrenadores",
                column: "Documento",
                unique: true);

            migrationBuilder.CreateIndex(
                name: "IX_Deportistas_Documento",
                table: "Deportistas",
                column: "Documento",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Arbitros_ColegiosInstrucciones_ColegioInstruccionId",
                table: "Arbitros",
                column: "ColegioInstruccionId",
                principalTable: "ColegiosInstrucciones",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Arbitros_ColegiosInstrucciones_ColegioInstruccionId",
                table: "Arbitros");

            migrationBuilder.DropIndex(
                name: "IX_UnidadesDeportivas_Nombre",
                table: "UnidadesDeportivas");

            migrationBuilder.DropIndex(
                name: "IX_Torneos_Nombre",
                table: "Torneos");

            migrationBuilder.DropIndex(
                name: "IX_Patrocinadores_Documento",
                table: "Patrocinadores");

            migrationBuilder.DropIndex(
                name: "IX_Escenarios_Nombre",
                table: "Escenarios");

            migrationBuilder.DropIndex(
                name: "IX_Equipos_Nombre",
                table: "Equipos");

            migrationBuilder.DropIndex(
                name: "IX_Entrenadores_Documento",
                table: "Entrenadores");

            migrationBuilder.DropIndex(
                name: "IX_Deportistas_Documento",
                table: "Deportistas");

            migrationBuilder.AddForeignKey(
                name: "FK_Arbitros_ColegiosInstrucciones_ColegioInstruccionId",
                table: "Arbitros",
                column: "ColegioInstruccionId",
                principalTable: "ColegiosInstrucciones",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
