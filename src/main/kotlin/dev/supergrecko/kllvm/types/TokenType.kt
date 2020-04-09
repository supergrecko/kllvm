package dev.supergrecko.kllvm.types

import dev.supergrecko.kllvm.llvm.typedefs.Context
import org.bytedeco.llvm.LLVM.LLVMTypeRef
import org.bytedeco.llvm.global.LLVM

public class TokenType public constructor(context: Context = Context.getGlobalContext()) : Type() {
    init {
        ref = LLVM.LLVMTokenTypeInContext(context.ref)
    }

    public constructor(llvmType: LLVMTypeRef) : this() {
        ref = llvmType
        requireKind(TypeKind.Token)
    }
}
