public class Planos {
    private String PlanoStart = "Plano Start: Valor Mensal de R$ 139,90 Durante 12 meses";
    // Plano Start, Fidelidade de 12 meses. A quebra do contrato do plano start resultará no pagamento de duas vezes o valoir da parcela.

    private String PlanoOpen = "Plano Open: Primeiro mês por R$ 39,90! A partir do segundo mês, parcelas de R$ 149,90";
    // Plano Open, Fidelidade de 2 meses. A quebra do contrato do plano start resultará no pagamento de duas vezes o valoir da parcela.

    private String Diaria = " Diária no Valor de R$ 50,00";

    private String MensalidadeOpen = "R$ 149,90";
    private String MensalidadeStart = "R$ 139,90";

    public Planos() {
    }

    public String getPlanoStart() {
        return PlanoStart;
    }

    public String getPlanoOpen() {
        return PlanoOpen;
    }

    public String getDiaria() {
        return Diaria;
    }

    public String getMensalidadeOpen() {
        return MensalidadeOpen;
    }

    public String getMensalidadeStart() {
        return MensalidadeStart;
    }
}
