package aula_310723;

public class EstudoEnums { //Enum é a abreviação de "enumerações", que significa "listado especificamente".

    public static void main(String[] args) {

        enum acai {
        PEQUENO, MEDIO, GRANDE
        }

        acai meuAcai = acai.MEDIO; //declarando um enum

        System.out.println("Quero um acai " + meuAcai);

        //percorrendo um enum
        for (acai outroAcai : acai.values()) {
            System.out.println(outroAcai);
        }

        //Diferença entre Enums e Classes
        //Um enum pode, assim como um class, ter atributos e métodos. A única diferença é que as constantes de enum são
        // public, static e final (inalteráveis - não podem ser substituídas).

        //O enum não pode ser usado para criar objetos e não pode estender outras classes (mas pode implementar interfaces).

        //Por que e quando usar enums?
        //Use enums quando tiver valores que você sabe que não serão alterados, como dias do mês, dias, cores, baralho de cartas, etc.
    }

}

