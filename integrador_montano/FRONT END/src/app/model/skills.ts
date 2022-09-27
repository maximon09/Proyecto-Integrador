export class Skills {
    id?: number;
    nombreSkill: string;
    porcentajeSkill: number;
    imgSkill: string;

    constructor(nombreSkill:string, porcentajeSkill:number, imgSkill:string){
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
        this.imgSkill = imgSkill;
    }
}
