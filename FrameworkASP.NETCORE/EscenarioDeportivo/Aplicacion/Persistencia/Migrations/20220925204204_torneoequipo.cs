using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Persistencia.Migrations
{
    public partial class torneoequipo : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_TorneoEquipos_Equipos_EquipoId",
                table: "TorneoEquipos");

            migrationBuilder.DropForeignKey(
                name: "FK_TorneoEquipos_Torneos_TorneoId",
                table: "TorneoEquipos");

            migrationBuilder.AlterColumn<int>(
                name: "TorneoId",
                table: "TorneoEquipos",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.AlterColumn<int>(
                name: "EquipoId",
                table: "TorneoEquipos",
                type: "int",
                nullable: false,
                defaultValue: 0,
                oldClrType: typeof(int),
                oldType: "int",
                oldNullable: true);

            migrationBuilder.AddForeignKey(
                name: "FK_TorneoEquipos_Equipos_EquipoId",
                table: "TorneoEquipos",
                column: "EquipoId",
                principalTable: "Equipos",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_TorneoEquipos_Torneos_TorneoId",
                table: "TorneoEquipos",
                column: "TorneoId",
                principalTable: "Torneos",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_TorneoEquipos_Equipos_EquipoId",
                table: "TorneoEquipos");

            migrationBuilder.DropForeignKey(
                name: "FK_TorneoEquipos_Torneos_TorneoId",
                table: "TorneoEquipos");

            migrationBuilder.AlterColumn<int>(
                name: "TorneoId",
                table: "TorneoEquipos",
                type: "int",
                nullable: true,
                oldClrType: typeof(int),
                oldType: "int");

            migrationBuilder.AlterColumn<int>(
                name: "EquipoId",
                table: "TorneoEquipos",
                type: "int",
                nullable: true,
                oldClrType: typeof(int),
                oldType: "int");

            migrationBuilder.AddForeignKey(
                name: "FK_TorneoEquipos_Equipos_EquipoId",
                table: "TorneoEquipos",
                column: "EquipoId",
                principalTable: "Equipos",
                principalColumn: "Id");

            migrationBuilder.AddForeignKey(
                name: "FK_TorneoEquipos_Torneos_TorneoId",
                table: "TorneoEquipos",
                column: "TorneoId",
                principalTable: "Torneos",
                principalColumn: "Id");
        }
    }
}
