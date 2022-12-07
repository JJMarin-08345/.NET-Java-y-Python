using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Persistencia.Migrations
{
    public partial class EntrenadorEquipoId : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Entrenadores_Equipos_EquipoId",
                table: "Entrenadores");

            migrationBuilder.DropIndex(
                name: "IX_Entrenadores_EquipoId",
                table: "Entrenadores");

            migrationBuilder.AlterColumn<int>(
                name: "EquipoId",
                table: "Entrenadores",
                type: "int",
                nullable: true,
                oldClrType: typeof(int),
                oldType: "int");

            migrationBuilder.CreateIndex(
                name: "IX_Entrenadores_EquipoId",
                table: "Entrenadores",
                column: "EquipoId",
                unique: true,
                filter: "[EquipoId] IS NOT NULL");

            migrationBuilder.AddForeignKey(
                name: "FK_Entrenadores_Equipos_EquipoId",
                table: "Entrenadores",
                column: "EquipoId",
                principalTable: "Equipos",
                principalColumn: "Id");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Entrenadores_Equipos_EquipoId",
                table: "Entrenadores");

            migrationBuilder.DropIndex(
                name: "IX_Entrenadores_EquipoId",
                table: "Entrenadores");

            migrationBuilder.AlterColumn<int>(
                name: "EquipoId",
                table: "Entrenadores",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Entrenadores_EquipoId",
                table: "Entrenadores",
                column: "EquipoId",
                unique: true);

            migrationBuilder.AddForeignKey(
                name: "FK_Entrenadores_Equipos_EquipoId",
                table: "Entrenadores",
                column: "EquipoId",
                principalTable: "Equipos",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
